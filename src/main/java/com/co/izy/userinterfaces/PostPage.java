package com.co.izy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PostPage {

    public static final Target MENU_BAR = Target.the("abrir menu hamburguesa")
            .locatedBy("//i[@class='fa-solid fa-bars']");
    public static final Target TXT_POSTS = Target.the("clic en el enlace Posts")
            .locatedBy("//div[@class='row navigation-one w-100']//li[3]//a[1]");
    public static final Target DROP_CATEGORY = Target.the(("clic seccion accion a realizar"))
            .locatedBy("//button[normalize-space()='¿Qué acción deseas realizar?']");
    public static final Target SLC_CATEGORY = Target.the("clic en create category")
            .locatedBy("//a[@id='effect-button']");
    public static final Target TXT_NAMECATEGORY = Target.the("ingresar nombre de la categoria")
            .locatedBy("//body/section[@id='To-do-principal']/div[@id='container-form']/form[@id='formulario']/div[2]/input[1]");
    public static final Target TXT_DESCRIPTIONCAT = Target.the("ingresar la descripcion de la categoria")
            .locatedBy("//body/section[@id='To-do-principal']/div[@id='container-form']/form[@id='formulario']/div[3]/input[1]");
    public static final Target RADIO_BUTTON = Target.the("seleccionar radiobutton")
            .locatedBy("//div[@class='form-check me-3']//input[@id='flexRadioDefault2']");
    //public static final Target FILE_INPUT = Target.the("seleccionar archivo a cargar")
    //        .locatedBy("//input[@id='featured']");
    public static final Target BTN_CREATE = Target.the("dar clic en el boton crear")
            .locatedBy("//button[@id='effect-button']");
    public static final Target TXT_POSTTITLE = Target.the("titulo de posts")
            .locatedBy("//span[normalize-space()='Nuestras Categorías de Cursos']");

}
