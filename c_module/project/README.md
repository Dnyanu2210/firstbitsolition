🏏 Player Management System
📌 Project Overview

The Player Management System is a C-based console application designed to efficiently manage cricket player information.
It allows the user to add, remove, search, update, display, and sort players, as well as display the top 3 players based on runs and wickets.

This system is useful for managing cricket teams in a structured and organized way, with support for dynamic resizing of the player array if more players are added than the initial capacity.

⚙️ Features

➕ Add Player – Add new player details:

Jersey Number

Name

Runs

Wickets

Matches Played

Automatically expands the array using realloc() if the array is full.

➖ Remove Player – Remove a player by their jersey number.

🔍 Search Player – Search player details using jersey number and name.

✏️ Update Player – Update details of an existing player:

Name

Runs

Wickets

Matches Played

Jersey Number

📋 Display All Players – View all stored player details.

📊 Sort Players – Sort players by runs or wickets in descending order.

🏆 Top 3 Players – Display the top 3 players based on runs and wickets.

📂 Project Structure
Player-Management-System/
│── main.c          # Main source code file
│── README.md       # Project documentation

🖥️ Technologies Used

Language: C

Compiler: GCC (or any standard C compiler)

Memory Management: Dynamic memory allocation using malloc() and realloc()

📌 Player Attributes

Each player record contains the following details:

JerseyNo – Unique jersey number of the player

Name – Player’s name

Runs – Total runs scored

Wickets – Total wickets taken

Matches_played – Number of matches played

🚀 How to Run the Project

Clone the repository:
git clone https://github.com/Dnyanu2210/Player-Management-System.git
cd Player-Management-System


Compile the program:

gcc main.c -o player_management


Run the executable:

./player_management

📋 Menu Options

When you run the program, you’ll see:

***** Player Management System *****
1. Add Player
2. Remove Player
3. Search Player
4. Update Player
5. Display All Players
6. Sort Players by Runs
7. Sort Players by Wickets
8. Top 3 Players by Runs
9. Top 3 Players by Wickets
10. Exit

🏏 Example Workflow

Add players with details like jersey number, name, runs, wickets, and matches played.

Search for a player by jersey number.

Update or remove a player’s record.

Display all players in sorted order.

View the top 3 players based on runs and wickets.

💡 Notes

The program supports dynamic resizing. If the player array is full, it will ask you to enter extra size to expand:

Array is full. Enter extra size to expand:


The memory is handled using malloc() for initial allocation and realloc() for resizing.

All operations are performed in memory and last until the program exits.

👤 Author

Dnyaneshwari Rokade
Savitribai Phule Pune University (SPPU)
Bachelor of Engineering - Computer Science

📝 License

This project is open-source and free to use.
