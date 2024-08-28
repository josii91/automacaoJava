Feature: Cria um produto com o POST /products

  Scenario: Cria um produto com sucesso
    Given defino a url da api
    When  chamo o POST "products" para criar um produto
    Then valido que a consulta retorna o status code 200
    Then é validado que o campo "id" é igual a "21"
    Then é validado que o campo "title" é igual a "test product"
    Then é validado que o campo "price" é igual a "13.5"
    Then é validado que o campo "description" é igual a "lorem ipsum set"
    Then é validado que o campo "image" é igual a "https: //i.pravatar.cc"
    Then é validado que o campo "category" é igual a "electronic"

