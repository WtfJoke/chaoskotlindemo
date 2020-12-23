## Chaos Kotlin (Mediator Kotlin Port)
Media recommender ([Mediator](https://github.com/fletchgqc/mediator))

A demonstration app for [Chaos Monkey for Spring Boot](https://github.com/codecentric/chaos-monkey-spring-boot)


Check out the Postman requests collection to play around:  
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/be413ed82dc7dbfadfcd)


#### Details
Runs with following chaos monkey configuration (see `application.yml` or postman collection request "Actuator CM"):

````json
{
    "chaosMonkeyProperties": {
        "enabled": true
    },
    "assaultProperties": {
        "level": 3,
        "latencyRangeStart": 1000,
        "latencyRangeEnd": 3000,
        "latencyActive": true,
        "exceptionsActive": false,
        "exception": {
            "type": null,
            "arguments": null
        },
        "killApplicationActive": false,
        "memoryActive": false,
        "memoryMillisecondsHoldFilledMemory": 90000,
        "memoryMillisecondsWaitNextIncrease": 1000,
        "memoryFillIncrementFraction": 0.15,
        "memoryFillTargetFraction": 0.25,
        "runtimeAssaultCronExpression": "OFF",
        "watchedCustomServices": null
    },
    "watcherProperties": {
        "controller": false,
        "restController": false,
        "service": true,
        "repository": true,
        "component": false
    }
}
````
