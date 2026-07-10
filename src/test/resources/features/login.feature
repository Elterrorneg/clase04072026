Feature: Iniciar Sesion
  @Login @Happy
  Scenario Outline: Iniciar Sesion
    Given el usuario esta en la pagina de principal
    When inicia sesion con su nombre de usuario "<username>" y contrasenia "<password>"
    Then se realiza el inicio de sesion de manera exitosa
    Examples:
      |username   | password|
      |usuarioBryan1| pass123 |