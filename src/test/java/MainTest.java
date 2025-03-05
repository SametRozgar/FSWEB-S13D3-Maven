package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private Person person;
    private Wall wall;

    @BeforeEach
    void setUp() {
        person = new Person("John", "Doe", 20);
        wall = new Wall(10, 10);
    }

    @DisplayName("Person sınıf değişkenleri doğru tipte mi?")
    @Test
    public void testPersonTypes() {
        assertThat(person.getFirstName(), instanceOf(String.class));
        assertThat(person.getLastName(), instanceOf(String.class));
        assertThat(person.getAge(), instanceOf(Integer.class));
    }

    @DisplayName("getFirstName metodu doğru çalışıyor mu?")
    @Test
    public void testPersonGetFirstName() {
        assertEquals("John", person.getFirstName());
    }

    @DisplayName("getLastName metodu doğru çalışıyor mu?")
    @Test
    public void testPersonGetLastName() {
        assertEquals("Doe", person.getLastName());
    }

    @DisplayName("getAge metodu doğru çalışıyor mu?")
    @Test
    public void testPersonGetAge() {
        assertEquals(20, person.getAge());
    }

    @DisplayName("isTeen metodu doğru çalışıyor mu?")
    @Test
    public void testPersonIsTeen() {
        assertEquals(true, new Person("Jane", "Doe", 18).isTeen());
        assertEquals(false, new Person("Jane", "Doe", 22).isTeen());
        assertEquals(true, new Person("Jane", "Doe", 13).isTeen());
    }

    @DisplayName("Wall sınıf değişkenleri doğru tipte mi?")
    @Test
    public void testWallTypes() {
        assertThat(wall.getWidth(), instanceOf(Double.class));
        assertThat(wall.getHeight(), instanceOf(Double.class));
    }

    @DisplayName("getWidth metodu doğru çalışıyor mu?")
    @Test
    public void testWallGetWidth() {
        assertEquals(10, wall.getWidth());
    }

    @DisplayName("getHeight metodu doğru çalışıyor mu?")
    @Test
    public void testWallGetHeight() {
        assertEquals(10, wall.getHeight());
    }

    @DisplayName("setWidth metodu doğru çalışıyor mu?")
    @Test
    public void testWallSetWidth() {
        wall.setWidth(20);
        assertEquals(20, wall.getWidth());

        wall.setWidth(-10);
        assertEquals(0, wall.getWidth());
    }

    @DisplayName("setHeight metodu doğru çalışıyor mu?")
    @Test
    public void testWallSetHeight() {
        wall.setHeight(20);
        assertEquals(20, wall.getHeight());

        wall.setHeight(-10);
        assertEquals(0, wall.getHeight());
    }

    @DisplayName("getArea metodu doğru çalışıyor mu?")
    @Test
    public void testWallGetArea() {
        wall.setWidth(10);
        wall.setHeight(10);
        assertEquals(100, wall.getArea());

        wall.setHeight(-10);
        assertEquals(0, wall.getArea());
    }
}
