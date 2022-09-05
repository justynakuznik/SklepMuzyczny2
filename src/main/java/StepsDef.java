import java.util.LinkedList;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

public class StepsDef {
    SklepMuzyczny sklepMuzyczny;
    private LinkedList<Album> albumy;
    Album album = new Album(150,Gatunek.ROCK,1990);
    int result;

//    @Given("I test sklepMuzyczny")
//    public void i_test_sklepmuzyczny(){
//        sklepMuzyczny = new SklepMuzyczny(new LinkedList<>());
//    }
//    @When("I add album")
//    public void i_add_album(){
//        sklepMuzyczny.dodajAlbum(album);
//    }
//    @Then("result is {int}")
//    public void result_is(Integer int1){
//        result = int1;
//        assertEquals(result, sklepMuzyczny.getAlbums().size());
//
//    }


}
