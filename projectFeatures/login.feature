Feature: Login en la pagina STD
  Yo como usuario recurrente 
  Quiero poder iniciar sesion
  Para ingresar a la pagina de capacitacion.

  Scenario Outline: Registro Usuario Exitoso
    Given Dado que el usuario esta en la pagina de Login
    When el usuario da click en el boton crear cuenta
    And el usuario ingresa su nombre
    And correo <email>
    And el usuario ingresa telefono
    And el usuario selecciona el genero
    And password <password>
    And verifica su password <repassword>
    And pais <pais>
    And el usuario selecciona la suscripcion
    And el usuario da click en el boton submitir 
    Then la cuenta fue creada con exito

Examples:
|email|password|repassword|pais|
|email1@gmail.com|abc123456|abc123456|US|
|email2@gmail.com|zxy987654|zxy987654|Canada|


  Scenario Outline: Login Exitoso Parametrizado
  	Given Dado que el usuario esta en la pagina de Login
    When el usuario ingrese un <correo>
    And y un <password>
   	Then el usuario puede ver su perfil
    
		Examples:
		|email|password|
		|email1@gmail.com|abc123456|
		


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
    
   
