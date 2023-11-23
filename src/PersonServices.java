public class PersonServices {
/*т.к. используем другой класс
* тут надо будет передавать класс Person
*/

    public boolean isAdult(Person person) {
        return person.getYear() > 18;
    }
}
