# Deprecated
This project is deprecated, you could check [this one](https://github.com/MayconCardoso/StockTradeTracking) instead.


# Modularized Single Activity Navigation
This is a simple example of a Single Activity application. On this project, you will see how to implement a good navigation approach by using Google Navigation Component in a modularized app.

Modularization is a very hot subject these days. There are hundreds of thousands of articles and examples on the internet that are really very good and very didactic. However, few of these articles represent the scenario of a real application, nor how to migrate from a monolithic and legacy project to a modular application.

With that, I decided to start a series of publications focused on modularization in real contexts. This is the first one where we have to create navigation between features of different modules.

# Project Structure
You are gonna see that I split the project into two folders: [libraries](https://github.com/MayconCardoso/Modularized-Single-Activity-Navigation/tree/master/libraries) and [features](https://github.com/MayconCardoso/Modularized-Single-Activity-Navigation/tree/master/features).

In this project we have no problems with module organization since we have a small project. But as your project grows, it becomes difficult to keep your modules organized. My suggestion is to split your modules into segments and organize your [settings.gradle](https://github.com/MayconCardoso/Modularized-Single-Activity-Navigation/blob/master/settings.gradle) so you can have a view like the photo shown below.

![Modularization structure](https://github.com/MayconCardoso/Modularized-Single-Activity-Navigation/blob/master/.art/modules.png)


# Libraries

Here you can check out the [dependencies file.](https://github.com/MayconCardoso/Modularized-Single-Activity-Navigation/blob/master/build-dependencies.gradle) But basically these are the libraries used in this example:

- [Koin](https://insert-koin.io/): For inject the dependencies.
- [Navigation Component](https://developer.android.com/guide/navigation/): For the core navigation between fragments.
