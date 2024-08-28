Feature: Atualiza um produto com o PUT /products/id

  Scenario: Atualiza um produto com sucesso
    Given defino a url da api
    When  chamo o PUT "products/6" para atualizar um produto
    Then valido que a consulta retorna o status code 200
    Then é validado que o campo "id" é igual a "6"
    Then é validado que o campo "title" é igual a "test product"
    Then é validado que o campo "price" é igual a "13.5"
    Then é validado que o campo "description" é igual a "lorem ipsum set"
    Then é validado que o campo "image" é igual a "https: //i.pravatar.cc"
    Then é validado que o campo "category" é igual a "electronic"