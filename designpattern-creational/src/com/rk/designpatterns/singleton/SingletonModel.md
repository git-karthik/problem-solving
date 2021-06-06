## Overview

This is a model implementation to Singleton Design Pattern

## Implementation Cons

- Although the implementation looks tempting to apply, it should be handled with care. Not every class in an application can be made singleton. It could lead to performance issues.

- Unit testing isn't feasible for the below reasons
    - There is no interface exposed
    - The constructors and member variables are private

- Thread safety should be minded carefully.

## Thumb Rule
- Singleton class just has only one no-args constructor
- Has no interface to implement

## Usage Examples
- A Database connection object
- A simple logger implementation