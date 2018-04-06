Feature: Login en la pagina STD
  Yo como usuario recurrente 
  Quiero poder iniciar sesion
  Para ingresar a la pagina de capacitacion.

  Scenario Outline: Registro Usuario Exitoso
    Given Dado que el usuario esta en la pagina de Login
    When el usuario da click en el boton crear cuenta
    And el usuario ingresa su nombre
    And y su <email>
    And el usuario ingresa telefono
    And el usuario selecciona el genero
    And el usuario ingresa el password
    And el usuario ingresa la verificacion del password
    And el usuario selecciona el pais
    And el usuario selecciona la suscripcion
    And el usuario da click en el boton submitir 
    Then la cuenta fue creada con exito

Examples:
|email|
|email1@gmail.com|
|email2@gmail.com|
  Scenario: Login Exitoso
  	Given Dado que el usuario esta en la pagina de Login
    When el usuario ingrese una credencial valida
    Then el usuario puede ver su perfil

  #Scenario: Login Usuario Fallido
   # Given Dado que el usuario esta en la pagina de Login
    #When el usuario ingrese un usuario erroneo
    #Then Invalid User Name

  #Scenario: Login Password Fallido
   # Given Dado que el usuario esta en la pagina de Login
    #When el usuario ingrese un password erroneo
    #Then Invalid Password
    
   
