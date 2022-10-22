package co.com.choucair.Reto_Tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoSite extends PageObject {
    public static final Target FIRST_NAME =  Target.the("Nombre del usuario").located(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")));
    public static final Target LAST_NAME =  Target.the("Apellido del usuario").located(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")));
    public static final Target ADDRESS =  Target.the("Direccion de domicilio del usuario").located(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")));
    public static final Target EMAIL_ADDRESS =  Target.the("Correo electronico del usuario").located(By.xpath(("//*[@id=\"eid\"]/input")));
    public static final Target PHONE =  Target.the("Numero telefonico del usuario").located(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")));
    public static final Target GENDER =  Target.the("Genero del usuario").located(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")));
    public static final Target HOBBIES =  Target.the("Pasatiempo del usuario").located(By.id(("checkbox2")));
    public static final Target LANGUAGES_0 =  Target.the("Idioma que habla el usuario").located(By.id("msdd"));
    public static final Target LANGUAGES_1 =  Target.the("Idioma que habla el usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
    public static final Target SKILLS =  Target.the("Lenguaje de programacion que maneja el usuario").located(By.id(("Skills")));
    public static final Target COUNTRY_0 =  Target.the("Pais del usuario").located(By.id(("countries")));
    public static final Target COUNTRY_1 =  Target.the("Pais del usuario").located(By.id(("countries")));
    public static final Target SELECT_COUNTRY_0 =  Target.the("Pais de residencia del usuario").located(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")));
    public static final Target SELECT_COUNTRY_1 =  Target.the("Pais de residencia del usuario").located(By.xpath(("/html/body/span/span/span[1]/input")));
    public static final Target YEAR_BIRTH =  Target.the("Año de nacimiento del usuario").located(By.id(("yearbox")));
    public static final Target MONTH_BIRTH =  Target.the("Mes de nacimiento del usuario").located(By.xpath(("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
    public static final Target DAY_BIRTH =  Target.the("Dia de nacimiento del usuario").located(By.id(("daybox")));
    public static final Target PASSWORD =  Target.the("Contraseña del usuario").located(By.xpath(("//*[@id=\"firstpassword\"]")));
    public static final Target CONFIRM_PASSWORD =  Target.the("Confirmar la contraseña del usuario").located(By.id(("secondpassword")));
    public static final Target SUBMIT =  Target.the("Confirmamos la informacion y enviamos").located(By.id(("submitbtn")));
}
