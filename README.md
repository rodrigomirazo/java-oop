# java-oop
Learn Object Oriented Programming with examples in Java

## Topics
<ol>
    <li>Abstraction</li>
    <li>Encapsulation</li>
    <li>Inheritance</li>
    <li>Polimorphism</li>
</ol>

### 1. Abstraction

##### Concept
<p>Dealing with ideas rather than events</p>
<p>Abstraction is a process of hiding the implementation details from the user.
This mean, user will only have the knowledge of `what the object does` and not `how it does`.
</p>

##### Abstract Class

<ul>
<li>A class which contains the abstract keyword in its declaration is known as abstract class.</li>

<li>Abstract classes may or may not contain abstract methods.</li>

<li>If a class is declared abstract, it cannot be instantiated.</li>

<li>To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.</li>

<li>If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.</li>
</ul>

##### Advantages
User does not have to understand inner logic for methods, just reuse it.

### 2. Encapsulation

##### Concept
<p>
The process of binding data and corresponding methods (behavior) together into a single unit.
</p>
<p>
The process of hidding data attributes from class, using methods.
</p>

##### How to do it

<ol>
<li>Declare the variables of a class as private.</li>
<li>Provide public setter and getter methods to modify and view the variables values.</li>
</ol>

##### Examples
`
public class CelestialBody {
    private String name;
    
    public String getName() {
            return name;
    }
        
    public CelestialBody setName(String name) {
        this.name = name;
        return this;
    }

##### Advantages

1. The encapsulated code is more flexible and easy to change with new requirements.
2. It prevents the other classes to access the private fields.
3. Encapsulation allows modifying implemented code without breaking other code who have implemented the code.
4. It keeps the data and codes safe from external inheritance. Thus, Encapsulation helps to achieve security.

### 3. Inheritance

<h5>Concept</h5>
<p>Is the process to derive properties (fields) and/or behavior (functions) from a class.</p>
<p>This conect also describes:</p>

`is a` relationship

##### Examples

`Earth is A Planet` &
`A Planet is A Celestial Body`

###### Explanation

<table>
    <tr>
            <td></td>
            <td>Super Class</td>
            <td>Sub Class</td>
        </tr>
        <tr>
            <td>1.</td>
            <td>Planet</td>
            <td>Earth</td>
        </tr>
        <tr>
            <td>2.</td>
            <td>Celestial Body</td>
            <td>Planet</td>
        </tr>
</table>

<h5>How can we use it in Java?</h5>
With the reserve word `extends`

####Important Concepts

<ul>
  <li>Super Class
        <ul>
            <li>
                The class whose features are inherited is known as superclass (or a base class or a parent class).
            </li>
        </ul>
  </li>
    
  <li>Sub Class
    <ul>
        <li>
            The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
        </li>
    </ul>
  </li>
  <li>Reusability
        <ul>
            <li>
                Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
            </li>
        </ul>
  </li>
</ul>


### 4. Polimorphism

<h5>Concept</h5>
<p>Is the capacity of having different forms.</p>
<p>Perform action in different forms, or implement an interface with multiple implementations.</p>

##### Examples

<ul>
    <li> <h5>Overriding Behavior </h5>
        <ul>A Planet has an Eliptical Behavior</ul>
        <ul>Planet Mercurium has a spin-orbit Behavior</ul>
    </li>
    <li> <h5>Overloading Attributes </h5>
        <ul>Mars have being visted by Nasa</ul>
        <ul>Mars have being visted 3 times</ul>
    </li>
</ul>

##### Types of Polymorphism

<table>
    <tr>
        <td>Type</td>
        <td>Description</td>
    </tr>
    <tr>
        <td>Method Overloading</td>
        <td>
            Java knows what method will be implemented during compile time.
            Java determines the implementation by checking the signature.
        </td>
    </tr>
    <tr>
        <td>Method Overriding</td>
        <td>
            This is an example of runtime time <br>
            (or dynamic polymorphism)
        </td>
    </tr>
</table>


##### @Overload

`public void behavior() {` <br>
&nbsp;&nbsp;`System.out.println("Eliptical");` <br>
`}`

`void behavior(String behavior) {` <br>
&nbsp;&nbsp;`System.out.println("New Behavior " + behavior);` <br>
`}` <br>

##### @Override inherited by SUPER CLASS

`public class Mercurium extends Planet {`  <br>
&nbsp;&nbsp;`@Override` <br>
&nbsp;&nbsp;`public void orbitBehavior() {` <br>
&nbsp;&nbsp;&nbsp;&nbsp;`System.out.println("Orbit: spin-orbit");` <br>
&nbsp;&nbsp;`}` <br>
`}` <br>

##### @Override inherited by INTERFACE

`public class Mars implements Exploration {` <br>
&nbsp;&nbsp;`@Override` <br>
&nbsp;&nbsp;`public void nasaExplorations() {` <br>
&nbsp;&nbsp;&nbsp;&nbsp;`System.out.println("Explore by Nasa");` <br>
&nbsp;&nbsp;`}` <br>
`}` <br>






