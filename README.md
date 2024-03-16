# Git CLI

**Lucrare 3**

-   A Java-based project that simulates basic Git commands and functionalities, including file monitoring, status checks, information retrieval for various file types, and the 'commit' function.

## **Getting Started**

**Prerequisites**

-   Java Development Kit (JDK) version 8 or later
-   An IDE or code editor (IntelliJ, Eclipse, VS Code, etc.)

**Installation**

1.  Clone the repository:
    
    Bash
    
    ```
    [git clone https://github.com/<your-username>/Git-CLI.git](https://github.com/Andrei-Ciuperca/Lucrari_OOP/tree/main)
    
    ```
    
2.  Import the project into your IDE or compile it using your preferred build tool.

## Usage

1.  **Configure the file paths:**
    -   Open `Main.java` and modify the `CLOUD_PATH` and `FOLDER_PATH` constants to point to your desired cloud and local folders, respectively.
2.  **Run the application:**
    -   Run the `Main` class in your IDE or from your terminal.

**Interactive Menu**

The application provides the following options:

-   **1. Commit:** Copies files from your local machine folder to your cloud folder, simulating a Git commit.
-   **2. Info <fileName.extension>:** Provides detailed information about a specified file:
    -   **Text files:** Basic file info, line count, word count, character count
    -   **Image files:** Basic file info, image dimensions
    -   **Java files:** Basic file info, line count, approximate counts for classes and methods (with limitations)
-   **3. Status:** Compares your local folder and cloud folder, indicating changes, additions, or deletions.
-   **4. Quit:** Exits the program.

## **Features**

-   **File Monitoring:** Periodically compares files in your local and cloud folders to detect changes.
-   **File Information:** Retrieves detailed information for different file types (text, images, Java code).
-   **Commit Function:** Simulates a basic Git commit, copying files and updating a snapshot timestamp.
