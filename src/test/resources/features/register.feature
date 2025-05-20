Feature: Register and Post in Izyacademy

  Scenario: registro exitoso y publicación de post en izyacademy

    Given el usuario abre la pagina
    When el usuario realiza un registro exitoso
      | name  | username | country  | city     | dni      | phone     | email            | password |
      | Jorge | Jolutesttyt | Colombia | Medellin | 123458678 | 300000000 | jolud1st@yopmail.com | Password4521asd |
    And el usuario realiza una publicación de un post
      | namecategory   | descategory                              |
      | Categoria Jolu | Descripcion corta de la categoria automatizacion prueba final |
    Then el usuario podra ver los posts publicados