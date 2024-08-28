package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static org.junit.Assert.*;


public class Products {
    public int statusCode;
    public Response response;
    public ResponseBody body;
    private static String requestBody = "{\n" +
            "  \"title\": \"test product\",\n" +
            "  \"price\": \"13.5\",\n" +
            "  \"description\": \"lorem ipsum set\", \n" +
            "  \"image\": \"https: //i.pravatar.cc\",\n" +
            "  \"category\": \"electronic\" \n}";

    @Given("defino a url da api")
    public void defino_a_url_da_api() {
        RestAssured.baseURI = "https://fakestoreapi.com/";
    }

    @When("passo o path {string} na request")
    public void passo_o_path_na_request(String requisicao) {
        RequestSpecification httpRequest = RestAssured.given().log().all();
        response = httpRequest.get(requisicao);

    }

    @Then("valido que a consulta retorna o status code {int}")
    public void valido_que_a_consulta_retorna_o_status_code(Integer expectedCode) {
        int ResponseCode = response.getStatusCode();
        assertEquals(expectedCode, Integer.valueOf(ResponseCode));
    }

    @Then("é validado que o campo {string} é igual a {string}")
    public void é_validado_que_o_campo_é_igual_a(String campo, String valor) {
        String path;
        body = response.getBody();
        JsonPath jsnpath = response.jsonPath();
        if (campo.equals("rate")) {
            path = "rating.rate";
        } else if (campo.equals("count")) {
            path = "rating.count";

        } else {
            path = campo;
        }
        String campoValidado = jsnpath.getJsonObject(path).toString();
        assertEquals(valor, campoValidado);
    }

    @Then("valido que a quantidade de produtos retornados é {int}")
    public void valido_que_a_quantidade_de_produtos_retornados_é(Integer quantidadeEsperada) {

        JsonPath jsnpath = response.jsonPath();

        String id = jsnpath.getJsonObject("id").toString();

        int count = id.length();

        int quantidadeRegistros = count/3;


        System.out.println("Quantidade de objetos no array JSON: " + quantidadeRegistros);
        assertEquals(String.valueOf(quantidadeEsperada), String.valueOf(quantidadeRegistros));

    }


    @Then("valido que é retornado o valor {string} no response body")
    public void validoQueÉRetornadoOValorNoResponseBody(String categoria) {
        String getBody = response.asString();

        boolean inclui = getBody.contains(categoria);

        assertTrue(inclui);
    }

    @And("adiciono o body da requisição")
    public void adicionoOBodyDaRequisição() {
    }


    @When("passo o faço a requisição com path {string} para criar um produto")
    public void passoOFaçoARequisiçãoComPathParaCriarUmProduto(String requisicao) {
        response = RestAssured.given().log().all()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post(requisicao);

        System.out.println(response.asString());
    }

    @When("chamo o POST {string} para criar um produto")
    public void chamoOPOSTParaCriarUmProduto(String requisicao) {
        response = RestAssured.given().log().all()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post(requisicao);

        System.out.println(response.asString());
    }

    @When("chamo o PUT {string} para atualizar um produto")
    public void chamoOPUTParaAtualizarUmProduto(String requisicao) {
        response = RestAssured.given().log().all()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .put(requisicao);

        System.out.println(response.asString());
    }

    @When("chamo o DELETE {string} para criar um produto")
    public void chamoODELETEParaCriarUmProduto(String requisicao) {
        response = RestAssured.given().log().all()
                .header("Content-type", "application/json")
                .when()
                .delete(requisicao);

        System.out.println(response.asString());
    }
}
