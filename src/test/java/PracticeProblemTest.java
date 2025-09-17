import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void oddSumTest10() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, 0, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void lettersToFiveTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("lettersToFive", cArg);
  // Enter code here
      assertEquals(10, (int)method.invoke(null, "hello lillian", 'l'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void letterToFiveTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("lettersToFive", cArg);
  // Enter code here
    assertEquals(-1, (int)method.invoke(null, "help me", 'a'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countLetterTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countLetter", cArg);
  // Enter code here
    assertEquals(2, (int)method.invoke(null, "hello", 'l'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countLetterTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countLetter", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "I don't know", '!'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countLetterTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countLetter", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "", 'a'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countLetterTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countLetter", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, "computer science", 's'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countLetterTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countLetter", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "HELLO", 'l'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void countLetterTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("countLetter", cArg);
  // Enter code here
    assertEquals(4, (int)method.invoke(null, "123456789111", '1'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(3, (int)method.invoke(null, 2, 4));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(3, (int)method.invoke(null, 4, 2));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(4, (int)method.invoke(null, 1, 4));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(9, (int)method.invoke(null, 1, 5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(25, (int)method.invoke(null, 10, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(35, (int)method.invoke(null, 11, 3));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void lettersToFiveTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("lettersToFive", cArg);
  // Enter code here
    assertEquals(34, (int)method.invoke(null, "i am the best in the world you see", 'e'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void lettersToFiveTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("lettersToFive", cArg);
  // Enter code here
    assertEquals(-1, (int)method.invoke(null, "", 'z'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void lettersToFiveTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class, char.class};
        Method method = testClass.getDeclaredMethod("lettersToFive", cArg);
  // Enter code here
    assertEquals(5, (int)method.invoke(null, "bbbbb", 'b'));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest7() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, 1, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest8() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 8, 8));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void oddSumTest9() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("oddSum", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 0, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
