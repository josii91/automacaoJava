Feature: Apaga um produto com o DELETE /products/id

  Scenario: Apaga um produto com sucesso
    Given defino a url da api
    When  chamo o DELETE "products/7" para criar um produto
    Then valido que a consulta retorna o status code 200
    Then é validado que o campo "id" é igual a "7"
    Then é validado que o campo "title" é igual a "White Gold Plated Princess"
    Then é validado que o campo "price" é igual a "9.99"
    Then é validado que o campo "description" é igual a "Classic Created Wedding Engagement Solitaire Diamond Promise Ring for Her. Gifts to spoil your love more for Engagement, Wedding, Anniversary, Valentine's Day..."
    Then é validado que o campo "category" é igual a "jewelery"
    Then é validado que o campo "image" é igual a "https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg"
    Then é validado que o campo "rate" é igual a "3"
    Then é validado que o campo "count" é igual a "400"
