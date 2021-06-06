# Prototype Design Pattern

A prototype design pattern is used when the type of an object to be created is determined by a prototypical instance, which is cloned to produce a new instance. Often, the prototype pattern is used to get an unique instance of the same object.

## Concepts

The concepts of using a prototype depends on when you want to avoid a costly creation of an object
Avoids Subclassing - Light weight construction
Doesn't use the keyword "new"
Often utilizes an interface
Usually implemented with a Registry

Implements a Cloneable interface

## Pitfalls
Often not used
Typically used with other patterns
Shallow vs DeepCopy
