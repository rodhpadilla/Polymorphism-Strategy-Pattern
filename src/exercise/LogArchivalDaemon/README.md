# The Log Archival Daemon

## 📝 The Business Scenario
You are writing a background daemon for a Linux server farm. This daemon scans a directory for log files and archives them to save disk space.

**The Problem:**
Not all log files are treated equally. The "Archival Strategy" depends entirely on the **File Extension** of the log.

**The Rules:**
1.  **Text Logs (`.log`, `.txt`):**
    * These compress well. The system must simulate running `gzip <filename>`.
    * *Simulation:* Print `[GZIP] Compressing <filename>... ratio 90%`.
2.  **Media/Binary Logs (`.mp4`, `.bin`, `.jpg`):**
    * These do not compress well. Trying to zip them is a waste of CPU. The system must simply **Move** them to a backup folder.
    * *Simulation:* Print `[MV] Moving <filename> to /var/backup/`.
3.  **Security Logs (`.audit`, `.secure`):**
    * These contain sensitive data. They must be **Encrypted** before moving.
    * *Simulation:* Print `[GPG] Encrypting <filename> with RSA-4096...`.

**The Workflow:**
A generic **Archive Manager** receives a file object. It does not know (and should not care) if the file is text, binary, or audit. It simply asks a helper (The Factory) for the correct tool, and then tells that tool to "Archive This".

---

## 🚀 Your Mission

### Part 1: Architecture Discovery
Identify the 5 components based on the text above.
1.  **The Model:** (The passive data object representing a file).
2.  **The Interface:** (The contract for "Archiving").
3.  **The Beans:** (The 3 specific strategies).
4.  **The Factory:** (The decision maker).
5.  **The Service:** (The workflow manager).

*(Reply with these names first).*

### Part 2: The Implementation
Write the Java code.
* **Constraint:** The Service must be ignorant of the file extensions. It must rely on the Factory.

### Part 3: The Proof
Create a `Main` class (or JUnit) that creates 3 dummy files:
1.  `application.log`
2.  `video_recording.mp4`
3.  `payment_history.audit`

Pass them to the manager and verify the output changes automatically.