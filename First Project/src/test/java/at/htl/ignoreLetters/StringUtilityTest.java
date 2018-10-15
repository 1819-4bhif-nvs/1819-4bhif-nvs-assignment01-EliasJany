package at.htl.ignoreLetters;

import org.junit.jupiter.api.*;

import static  org.hamcrest.MatcherAssert.assertThat;
import static  org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {
    @BeforeAll
    static void beforeAll()
    {
        System.out.println("BeforeALL");
    }

    @BeforeEach
    void beforeEach()
    {
        System.out.println("BeforeEach");
    }

    @AfterAll
    static void afterAll()
    {
        System.out.println("AfterAll");
    }

    @AfterEach
    void afterEach()
    {
        System.out.println("AfterEach");
    }

    @Test
    void trimCharacterA_withStartingA(){
        String actual = StringUtility.trimCharacterA("AAAEEEE");
        String expected = "EEEE";
        assertThat(actual,is(expected));
    }

    @Test
    void trimCharacterA_withEndingA(){
        String actual = StringUtility.trimCharacterA("EEEEAAA");
        String expected = "EEEE";
        assertThat(actual,is(expected));
    }
}