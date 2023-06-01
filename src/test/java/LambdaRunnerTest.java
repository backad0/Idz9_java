import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LambdaRunnerTest {
    //getLength
    @Test
    public void lambda1FTest1(){
        assertEquals(4, LambdaRunner.run(LambdaDemo.getLength, "test"));
    }
    @Test
    public void lambda1FTest2(){
        assertEquals(0, LambdaRunner.run(LambdaDemo.getLength, ""));
    }
    //getFirstChar
    @Test
    public void lambda2FTest1(){
        assertEquals(null, LambdaRunner.run(LambdaDemo.getFirstChar, ""));
    }
    @Test
    public void lambda2FTest2(){
        assertEquals(null, LambdaRunner.run(LambdaDemo.getFirstChar, null));
    }
    @Test
    public void lambda2FTest3(){
        assertEquals('t', LambdaRunner.run(LambdaDemo.getFirstChar, "test"));
    }
    //notHaveSpaces
    @Test
    public void lambda3FTest1(){
        assertTrue(LambdaRunner.run(LambdaDemo.notHaveSpaces, "test"));
    }
    @Test
    public void lambda3FTest2(){
        assertFalse(LambdaRunner.run(LambdaDemo.notHaveSpaces, "t e s t"));
    }
    //getNumOfWords
    @Test
    public void lambda4FTest1(){
        assertEquals(1, LambdaRunner.run(LambdaDemo.getNumOfWords, "test test test test"));
    }
    @Test
    public void lambda4FTest2(){
        assertEquals(4, LambdaRunner.run(LambdaDemo.getNumOfWords, "test, test, test, test"));
    }
    //getAge
    @Test
    public void lambda5FTest1(){
        assertEquals(15, LambdaRunner.run(LambdaDemo.getAge,
                new Human("","","", 15, Gender.MALE)));
    }
    @Test
    public void lambda5FTest2(){
        assertEquals(15, LambdaRunner.run(LambdaDemo.getAge,
                new Student("","","", 15, Gender.MALE, "", "","")));
    }
    //isEqualsSurname
    @Test
    public void lambda6FTest1(){
        assertTrue( LambdaRunner.run(LambdaDemo.isEqualsSurname,
                new Human("Lincoln","","", 15, Gender.MALE),
                new Human("Lincoln","","", 15, Gender.MALE)));
    }
    @Test
    public void lambda6FTest2(){
        assertTrue( LambdaRunner.run(LambdaDemo.isEqualsSurname,
                new Human("Lincoln","","", 15, Gender.MALE),
                new Student("Lincoln","","", 15, Gender.MALE,"","","")));
    }
    @Test
    public void lambda6FTest3(){
        assertFalse( LambdaRunner.run(LambdaDemo.isEqualsSurname,
                new Human("Lincoln","","", 15, Gender.MALE),
                new Student("Lincolnini","","", 15, Gender.MALE,"","","")));
    }
    //getFullName
    @Test
    public void lambda7FTest1(){
        assertEquals("Lincoln first igorevich", LambdaRunner.run(LambdaDemo.getFullName,
                new Human("Lincoln","first","igorevich", 15, Gender.MALE)));
    }
    @Test
    public void lambda7FTest2(){
        assertEquals("Lincoln first igorevich", LambdaRunner.run(LambdaDemo.getFullName,
                new Student("Lincoln","first","igorevich", 15, Gender.MALE,"","","")));
    }
    //becameOlder
    @Test
    public void lambda8FTest1(){
        assertEquals(16, LambdaRunner.run(LambdaDemo.becameOlder,
                new Human("Lincoln","first","igorevich", 15, Gender.MALE)).getAge());
    }
    @Test
    public void lambda8FTest2(){
        assertEquals(16, LambdaRunner.run(LambdaDemo.becameOlder,
                new Student("Lincoln","first","igorevich",
                        15, Gender.MALE,"","","")).getAge());
    }
    //isEverybodyYounger
    @Test
    public void lambda9FTest1(){
        assertTrue(LambdaRunner.run(LambdaDemo.isEverybodyYounger,new ArrayList<Human>(){{
            add(new Human("","","",14, Gender.MALE));
            add(new Human("","","",13, Gender.MALE));
            add(new Human("","","",12, Gender.MALE));
        }}, 15));
    }

}
