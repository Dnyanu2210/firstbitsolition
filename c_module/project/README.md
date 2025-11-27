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
⚡🖤 CYBERPUNK PLAYER MANAGEMENT SYSTEM – C PROJECT
<div align="center">
██████╗ ██╗   ██╗██████╗ ███████╗██████╗ ██████╗ ██╗   ██╗███╗   ██╗██╗  ██╗
██╔══██╗╚██╗ ██╔╝██╔══██╗██╔════╝██╔══██╗██╔══██╗██║   ██║████╗  ██║╚██╗██╔╝
██████╔╝ ╚████╔╝ ██████╔╝█████╗  ██████╔╝██████╔╝██║   ██║██╔██╗ ██║ ╚███╔╝ 
██╔═══╝   ╚██╔╝  ██╔══██╗██╔══╝  ██╔══██╗██╔══██╗██║   ██║██║╚██╗██║ ██╔██╗ 
██║        ██║   ██║  ██║███████╗██║  ██║██████╔╝╚██████╔╝██║ ╚████║██╔╝ ██╗
╚═╝        ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝

🏏 NEXT GEN CRICKET PLAYER STATS MANAGER – BUILT IN C
<img src="https://img.shields.io/badge/C-Programming-000000?style=for-the-badge&logo=c&logoColor=00f0ff"> <img src="https://img.shields.io/badge/Memory-Dynamic%20Allocation-7600ff?style=for-the-badge&labelColor=000"> <img src="https://img.shields.io/badge/Sorting-Algorithms-00ffaa?style=for-the-badge&labelColor=000"> <img src="https://img.shields.io/badge/Status-Stable-brightgreen?style=for-the-badge&labelColor=000"> </div>
🌌 Project Overview

Welcome to CyberPMS — a neon-styled, futuristic C-based Player Management System, designed to manage cricket players using:

🧠 Structs
📦 Dynamic Memory Allocation
🔁 Sorting Algorithms
🧹 Efficient Updating & Removal System
⚡ Interactive Menu-Driven Program

This project blends DSA + C programming + Real statistics management.

🧩 Core Features
🏏 PLAYER OPERATIONS

✔ Add new players dynamically
✔ Display all players
✔ Update any player field
✔ Remove players safely

📊 STATISTICAL OPERATIONS

✔ Sort players by Runs (DESC)
✔ Sort players by Wickets (DESC)
✔ Top 3 Performers by Runs
✔ Top 3 Performers by Wickets

⚙ SYSTEM PERFORMANCE

✔ Auto-expandable memory (realloc)
✔ Minimal time complexity
✔ Bubble-sort based ranking
✔ Full data integrity checks

🧬 C Concepts Mastered Here
Concept	Usage
struct	Player blueprint
Dynamic Memory	malloc, realloc, free
String handling	Names & inputs
Pointers to pointer	Dynamic array expansion
Sorting logic	Bubble sort
Data shifting	Remove player
🗂 Folder Structure
CyberPMS/
│
├── main.c
├── player struct
├── store()
├── update()
├── remove_player()
├── sorted_players_by_runs()
├── sorted_players_by_wickets()
├── top3_by_runs()
└── top3_by_wickets()

💻 Menu Interface
--- Player Management ---
1. Store players
2. Display players
3. Update player
4. Remove player
5. Sort by runs
6. Sort by wickets
7. Top 3 by runs
8. Top 3 by wickets
10. Exit

⚡ How to Compile & Run
🔧 Compile
gcc main.c -o cyberpms

🚀 Run
./cyberpms

🔥 Sample Output
Player added successfully!

Player 1:
Jersey: 7
Name: Dhoni
Runs: 10500
Wickets: 3
Matches: 350

Players sorted by runs.

Top 3 Players by Runs:
1. Kohli - 12000 runs
2. Rohit - 9500 runs
3. Dhoni - 10500 runs

🚀 Future Upgrades (Premium Roadmap)

✨ Add search by name / jersey
✨ File storage (save & load players)
✨ Color-coded terminal output
✨ GUI version (C++ Qt)
✨ Multi-sport support

👨‍💻 Author

Your Name
🌐 GitHub: https://github.com/your-profile

📧 Email: your-email@example.com

<div align="center">
███████╗██╗   ██╗██████╗ ███████╗██████╗ ███╗   ███╗██████╗ 
██╔════╝██║   ██║██╔══██╗██╔════╝██╔══██╗████╗ ████║██╔══██╗
█████╗  ██║   ██║██████╔╝█████╗  ██████╔╝██╔████╔██║██████╔╝
██╔══╝  ██║   ██║██╔══██╗██╔══╝  ██╔══██╗██║╚██╔╝██║██╔══██╗
██║     ╚██████╔╝██║  ██║███████╗██║  ██║██║ ╚═╝ ██║██║  ██║
╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝

🌙✨ CYBERPUNK MODE ACTIVATED — Dark, Neon, and Beautiful
</div>
