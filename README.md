The program handle the user's input through methods in these classes. Every time the user inputs something, it will be processed by these methods to update the state of the machine. This setup simulates how real-world machines operate, where each part has a defined role.

As the coffee machine operates, it will keep track of its resources, including water, milk, coffee beans, disposable cups, and the cash collected. Each action taken by the user should be processed in the context of the machine's current state, which reflects the available resources.

Additionally, the coffee machine will monitor how many coffees have been made. After producing 10 cups, it will require cleaning. During this action, the machine will not be able to make any more coffee until it is cleaned by the user typing "clean". After cleaning, the machine resumes its normal operations.
