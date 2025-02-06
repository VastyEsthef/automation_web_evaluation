
#language: es

@testfeature
Característica: Product - Store

  @testMyStore
  Esquema del escenario: Validación del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "<email>" y clave "<password>"
    Cuando navego a la categoria "Clothes" y subcategoria "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra

    Ejemplos:
      | email                    | password     |
      | vasty.terrel07@gmail.com | Mystore159#  |