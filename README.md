# Quiz App

A multi-category Android quiz application built with Java and Android View-based UI. The app supports user registration/login, quiz attempts across multiple subjects, score calculation, and persistent history using Room.

## Project Summary

Quiz App is an Android application focused on quick learning and fun assessments. Users can:

- Create an account and log in
- Attempt quizzes in multiple subjects
- Get instant result summaries per attempt
- Track cumulative performance over time
- Update account password

The project uses a classic Android architecture with Activities, utility classes, Room persistence, and SharedPreferences session storage.

## Key Features

- User authentication flow
  - Register with username, email, and password
  - Login and logout with local session persistence
- Quiz categories
  - Math
  - Geography
  - Literature
  - Programming
  - IQ
  - Sports
  - History (Bangladesh history question set)
  - Islam
- Quiz mechanics
  - Randomized question selection
  - Fixed number of questions per attempt
  - Instant result screen after completion
- Score system
  - Correct answer: +5 points
  - Incorrect answer: -2 points
  - Overall score accumulation across attempts
- Attempt history
  - Subject-wise past attempts
  - Earned points
  - Attempt date/time
- Rules/onboarding screen
  - Swipeable rule slides with indicator and GIF visuals
- Password management
  - In-app password update for logged-in users

## Technology Stack

- Language: Java (Java 11 target)
- UI: Android Views + XML layouts
- Local database: Room (SQLite)
- Session storage: SharedPreferences + Gson serialization
- Build system: Gradle (Kotlin DSL)
- Android Gradle Plugin: 8.7.3
- Compile SDK: 34
- Min SDK: 24
- Target SDK: 34

## Dependencies

Primary libraries used:

- AndroidX AppCompat
- Material Components
- Activity
- ConstraintLayout
- Room runtime and compiler
- Gson
- Dots Indicator (viewpager indicator)
- Android GIF Drawable
- JUnit + AndroidX test + Espresso

## Application Flow

1. Splash screen
2. Login/Register
3. Home screen
4. Choose quiz category
5. Attempt quiz
6. View final result
7. Persist attempt and update overall points
8. Review history from home screen

## Scoring and Question Rules

- The app displays 10 randomized questions per quiz attempt.
- Math quiz expects typed answers.
- Other categories use multiple-choice options.
- Scoring formula per attempt:

  earned = (correct x 5) - (incorrect x 2)

- Overall points are computed by summing earned points across all attempts for the logged-in user.

## Data Model

### User

- username
- email (primary key)
- password

### Attempt

- createdTime (primary key)
- subject
- correct
- incorrect
- earned
- email (user reference by email string)
- overallPoints

## Project Structure

- app/src/main/java/com/example/quiz_app/Activity
  - Activity screens: authentication, quizzes, results, history, rules
- app/src/main/java/com/example/quiz_app/data
  - Room entities, DAO, database client
- app/src/main/java/com/example/quiz_app/adapter
  - RecyclerView and ViewPager adapters
- app/src/main/java/com/example/quiz_app/other
  - Constants, helpers, shared preference utilities
- app/src/main/res
  - XML layouts, strings, drawables

## Setup and Run

### Prerequisites

- Android Studio (recent stable release)
- Android SDK 34 installed
- JDK 11 configured
- Gradle wrapper (already included)

### Run with Android Studio

1. Open the project root in Android Studio.
2. Let Gradle sync complete.
3. Select an emulator/device.
4. Run the app module.

### Run from command line

```bash
./gradlew assembleDebug
```

Install debug APK on a connected device/emulator:

```bash
./gradlew installDebug
```

Run unit tests:

```bash
./gradlew test
```

Run instrumentation tests:

```bash
./gradlew connectedAndroidTest
```

## Build Configuration

- Namespace: com.example.quiz_app
- Application ID: com.example.quiz_app
- Version code: 1
- Version name: 1.0
- Release minification: disabled

## Full A to Z Analysis

### What is good

- Clear end-to-end quiz experience with meaningful user journey
- Local persistence with Room for attempts and users
- Session management implemented via SharedPreferences
- Multi-category question bank with randomized selection
- Result and history screens provide measurable feedback to users
- Codebase is small and understandable for beginner/intermediate Android learning

### Architecture and maintainability observations

- The app follows a straightforward Activity-based design that is easy to navigate.
- Data access is centralized in Room DAO, which keeps persistence logic organized.
- Utility class contains all question sets and helper methods, reducing file sprawl but making one class very large.

### Risks and limitations

- Security:
  - Passwords are stored as plain text in local database.
  - No encryption/hashing is used for credentials.
- Deprecated patterns:
  - AsyncTask is used for background operations.
- Validation robustness:
  - Some quiz flows can fail if no option is selected before pressing Next.
- Data relationships:
  - Attempts are linked by email string instead of Room foreign key relation.
- Randomization logic:
  - Current question selection condition can return one extra question due to <= size check.
- Offline and sync scope:
  - Entire app is local-only; no cloud backup, remote auth, or cross-device sync.

### Recommended improvements (priority order)

1. Security hardening
   - Hash passwords (for example BCrypt/Argon2 compatible approach on Android)
   - Consider encrypted preferences for session data
2. Modern async approach
   - Replace AsyncTask with coroutines or Executor plus lifecycle-aware patterns
3. Architecture modernization
   - Move toward MVVM with Repository and ViewModel
4. Data integrity
   - Add Room relation constraints between user and attempts
5. UX resilience
   - Guard against empty MCQ selection before evaluation
6. Test coverage
   - Add unit tests for scoring, validation, and random selection logic
7. Content management
   - Move large static question bank from code to JSON/assets or local database seeding

## Suggested Roadmap

- Phase 1: Stability and security
  - Fix input edge cases
  - Improve credential handling
- Phase 2: Architecture and readability
  - Introduce ViewModel/Repository
  - Break utilities into feature-focused classes
- Phase 3: Product expansion
  - Add leaderboard
  - Add timed quizzes
  - Add difficulty levels
  - Add cloud sync and backup

## Contributing

Contributions are welcome.

Recommended contribution flow:

1. Fork repository
2. Create feature branch
3. Make focused changes with tests
4. Submit pull request with clear description

## License

This project includes a LICENSE file in the repository root. Please review it for usage terms.

## Acknowledgment

Built as an Android learning and quiz-practice project using Java, Room, and AndroidX libraries.
