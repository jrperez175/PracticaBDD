Feature: Login en la pagina STD
  Yo como usuario recurrente 
  Quiero poder iniciar sesion
  Para ingresar a la pagina de capacitacion.

  Scenario Outline: Login Exitoso Parametrizado
    Given Dado que el usuario esta en la pagina de Login
    When el usuario ingrese un <correo>
    And y un <password>
    And y hace clik en el boton Login
    Then el usuario puede ver su perfil

    Examples: 
      | correo           | password  |
      | email1@gmail.com | abc123456 |

  #Scenario: Login Exitoso
  #Given Dado que el usuario esta en la pagina de Login
  #When el usuario ingrese una credencial valida
  #Then el usuario puede ver su perfil
  
  Scenario Outline: Login Usuario Fallido
    Given Dado que el usuario esta en la pagina de Login
    When ingrese un correo erroneo <correo_err>
    And y un <password>
    And y hace clik en el boton Login
    Then Invalid User Name

    Examples: 
      | correo_err         |password|
      | emailxxx@gmail.com |abc123456|

  Scenario Outline: Login Password Fallido
    Given Dado que el usuario esta en la pagina de Login
    When el usuario ingrese un <correo>
    And password erroneo <password_err>
    And y hace clik en el boton Login
    Then Invalid Password

    Examples: 
     |correo| password_err |
     |email1@gmail.com| nico2008     |
