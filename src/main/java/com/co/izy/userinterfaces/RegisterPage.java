package com.co.izy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target PRELOADER = Target.the("preloader")
            .locatedBy("//div[@class='preloader']");
    public static final Target TXT_NAME = Target.the("ingresar nombre")
            .locatedBy("//div[@class='mb-4 form-group']//input[@id='exampleInputEmail1']");
    public static final Target TXT_USERNAME = Target.the("ingresar username")
            .locatedBy("//body/section[@id='To-do-principal']/div[@class='row container-form']/div[@class='col-lg-12 content-form']/div[@class='container']/form[@method='POST']/div[2]/input[1]");
    public static final Target SLC_COUNTRY = Target.the("seleccionar pais")
            .locatedBy("//select[@id='exampleInputEmail1']");
    public static final Target TXT_CITY = Target.the("ingresar ciudad")
            .locatedBy("//div[@class='mt-2 form-group ']//input[@id='exampleInputEmail1']");
    public static final Target TXT_DNI = Target.the("ingresar DNI")
            .locatedBy("//div[contains(@class,'mb-2 form-group')]//input[@id='exampleInputEmail1']");
    public static final Target TXT_PHONE = Target.the("ingresar telefono")
            .locatedBy("//div[@class='mb-2']//input[@id='exampleInputEmail1']");
    public static final Target TXT_EMAIL = Target.the("ingresar email")
            .locatedBy("//input[@id='email']");
    public static final Target TXT_PASSWORD = Target.the("ingresar contrasena")
            .locatedBy("//input[@id='password']");
    public static final Target TXT_VPASSWORD = Target.the("verificar contrasena")
            .locatedBy("//input[@id='password-confirm']");
    public static final Target BTN_REGISTER = Target.the("clic en el boton registrar")
            .locatedBy("//button[@id='effect-button']");
}