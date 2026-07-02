Builder is abstract

Concrete Builders implement the steps

Director orchestrates the building

Product is assembled step‑by‑step

This is the canonical GoF Builder Pattern — not the simplified “fluent builder” commonly used in modern Java.

Below is a complete, runnable GoF Builder Pattern example using a Car as the product.

🧠 GoF Builder Pattern — Core Concepts
1. Builder (abstract)
Defines the steps required to build the product.

2. Concrete Builder
Implements the steps to build a specific variant.

3. Director
Controls the building process (order of steps).

4. Product
The final object built step-by-step.

This pattern is used when:

Object construction is complex

Construction must be controlled

Variants of the same object must be created using different builders