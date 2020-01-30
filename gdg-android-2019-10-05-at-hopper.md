Notes October 5th hackathon @ Hopper
tech: data details to come ???

talk#1
Functional testing w kotlin
Marc-Antoine Sauve @ hopper

goals:
clean separate what/how
features: improve regression tests
concepts:
check out: robot pattern
+-----------------------------------------
Etienne @ shopify
Coroutine + Flow = MVI

view(model(intent()))
intent = actions to manipulate model

https://www.raywenderlich.com/817602-mvi-architecture-for-android-tutorial-getting-started

functional (immutable data)
reacitve  RXJava per Etienne

upvote app
view (push upvote buttom) updats screen counter

sealed class (object keyword singletons)

button > view event 

turn listener into a flow  (map)

callbackFlow (kotlin channels apis)

n.b. data classes are immutable  (copy operator for object)  use copy to update an immutable class

Phillipe Breault  @ american express

* look into kotlin smartcast
* look into kotlin android extentions https://antonioleiva.com/kotlin-android-extensions/
* atomic kotlin: (course to go with  the book)
* https://www.jetbrains.com/help/education/learner-start-guide.html?_ga=2.254409928.1955360151.1567035436-1906324223.1567035436&section=Atomic%20Kotlin
COURSERA COURSE ASSIGNMENTS kotlin for java devs
* https://www.jetbrains.com/help/education/coursera-programming-assignments.html?_ga=2.254409928.1955360151.1567035436-1906324223.1567035436&section=Atomic%20Kotlin
