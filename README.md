# rock7test

This is the project I developed to solve the technical test. It is made of:
- Java application. This app has a "main" that call the two public methods from the public interface (StacheLagBackend): insertJSON() and findViewedVessels().
- Table returned by DB Server
- Query that I used in the Java app.

This query is made using the initial assumtions that followss:
One vessel is visible by other if:
- The vessel is 0,1º long and 0,1º lat fare away.
- The vessel sent its position with 1 minute of difference between the other.
I also discarded all the vessels stopped at the beginning or the vessels were finished the race.
