Feature: Consulta produtos

  Scenario: Verifica a consulta de todos os produtos
    Given defino a url da api
    When passo o path "products" na request
    Then valido que a consulta retorna o status code 200

  Scenario: Verifica a consulta de apenas um produto
    Given defino a url da api
    When passo o path "products/3" na request
    Then valido que a consulta retorna o status code 200
    Then é validado que o campo "title" é igual a "Mens Cotton Jacket"
    Then é validado que o campo "price" é igual a "55.99"
    Then é validado que o campo "category" é igual a "men's clothing"
    Then é validado que o campo "rate" é igual a "4.7"
    Then é validado que o campo "count" é igual a "500"

  Scenario: Verifica a consulta do limite de resultados
    Given defino a url da api
    When passo o path "products?limit=2" na request
    Then valido que a consulta retorna o status code 200
    Then valido que a quantidade de produtos retornados é 2


  Scenario: Verifica a consulta de categorias
    Given defino a url da api
    When passo o path "products/categories" na request
    Then valido que a consulta retorna o status code 200
    Then valido que é retornado o valor "electronics" no response body
    Then valido que é retornado o valor "jewelery" no response body
    Then valido que é retornado o valor "men's clothing" no response body
    Then valido que é retornado o valor "women's clothing" no response body





