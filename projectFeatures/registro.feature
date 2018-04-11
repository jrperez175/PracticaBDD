#Feature: Registro en la pagina STD
 # Yo como usuario recurrente 
  #Quiero poder crear un registro
  #Para ingresar a la acceder a la pagina de capacitacion.
#
  #Scenario Outline: Registro Usuario Exitoso
   # Given Dado que el usuario esta en la pagina de Login
    #When el usuario da click en el boton crear cuenta
    #And el usuario ingresa su nombre
    #And correo <email>
    #And el usuario ingresa telefono
    #And el usuario selecciona el genero
    #And password <password>
    #And verifica su password <repassword>
    #And pais <pais>
    #And el usuario selecciona la suscripcion
    #And el usuario da click en el boton submitir 
    #Then la cuenta fue creada con exito
#
#Examples:
#|email|password|repassword|pais|
#|email1@gmail.com|abc123456|abc123456|US|
#|email2@gmail.com|zxy987654|zxy987654|Canada|
