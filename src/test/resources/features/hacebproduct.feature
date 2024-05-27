Feature: Elegir un producto aleatorio
  @product
  Scenario: Ingresar a Haceb para elegir producto

    Given el usuario ingresa a la URL de Haceb
    When selecciona categoría y subcategoría al azar
    And elige un producto de forma aleatoria
    And lo agrega al carrito
    Then se valida que sea el producto seleccionado

