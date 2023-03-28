import com.google.gson.Gson;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RickAndMortyTests {
    @Test
    public void testCharacterInformation() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.name, "Dale");
        Assert.assertEquals(character.status, "Dead");
        Assert.assertEquals(character.species, "Mythological Creature");
        Assert.assertEquals(character.type, "Giant");
        Assert.assertEquals(character.gender, "Male");
        Assert.assertEquals(character.origin.name, "Giant's Town");
        Assert.assertEquals(character.location.name, "Giant's Town");
    }

    @Test
    public void testCharacterName() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.name, "Dale");
    }

    @Test
    public void testCharacterStatus() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.status, "Dead");
    }

    @Test
    public void testCharacterSpecies() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.species, "Mythological Creature");
    }

    @Test
    public void testCharacterType() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.type, "Giant");
    }

    @Test
    public void testCharacterGender() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.gender, "Male");
    }

    @Test
    public void testCharacterOrigin() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.origin.name, "Giant's Town");
    }

    @Test
    public void testCharacterLocation() {
        Response response = RickAndMortyAPI.getCharacter(89);
        Assert.assertEquals(response.getStatusCode(), 200);

        Gson gson = new Gson();
        Character character = gson.fromJson(response.getBody().asString(), Character.class);

        Assert.assertEquals(character.location.name, "Giant's Town");
    }

    @Test
    public void testCharacterNotFound() {
        Response response = RickAndMortyAPI.getCharacter(999999);
        Assert.assertEquals(response.getStatusCode(), 404);
    }

}
