Feature: Agregar producto al carrito
  @AddProduct @Happy
  Scenario Outline: Agregar producto
    Given el usuario esta en la pagina de principal
    When se registra con un nombre de usuario "<username>" y contrasenia "<password>"
    And inicia sesion con su nombre de usuario "<username>" y contrasenia "<password>"
    And elige un producto
    And da click en el boton de agregar al carrito
    And se dirige a la pagina del  carrito
    Then se visualiza el producto en el carrito
    Examples:
      |username   | password|
      |usuarioBryan4| pass123 |