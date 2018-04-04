Feature: Login en la pagina STD
  Yo como usuario recurrente 
  Quiero poder iniciar sesion
  Para ingresar a la pagina de capacitacion.

  Scenario: Login Exitoso
    Given Dado que el usuario esta en la pagina de Login
    When el usuario ingrese una credencial valida
    Then el usuario puede ver su perfil

