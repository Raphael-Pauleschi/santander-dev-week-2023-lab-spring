# Santander Dev Week 2023 Lab Spring
Lab project in Spring Boot

## Class Diagram
```mermaid

    classDiagram
    class User {
        - name: String
        - account: Account
        - features: List<Feature>
        - card: Card
        - news: List<News>
        + User(name: String, account: Account, features: List<Feature>, card: Card, news: List<News>)
    }
    
    class Account {
        - number: String
        - agency: String
        - balance: Float
        - limit: Float
        + Account(number: String, agency: String, balance: Float, limit: Float)
    }

    class Feature {
        - icon: String
        - description: String
        + Feature(icon: String, description: String)
    }

    class Card {
        - number: String
        - limit: Float
        + Card(number: String, limit: Float)
    }

    class News {
        - icon: String
        - description: String
        + News(icon: String, description: String)
    }

    User --> Account
    User --> Feature
    User --> Card
    User --> News

```
