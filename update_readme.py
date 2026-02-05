import os

README_FILE = "README.md"

BASE_DIR = "LeetCode"
LEVELS = ["Easy", "Medium", "Hard"]


def extract_top_comments(file_path):
    """Read only the top comment block"""
    comments = []

    with open(file_path, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()

            if line.startswith("//"):
                comments.append(line.lstrip("/ ").strip())
            elif line == "":
                continue
            else:
                break

    return comments


def scan_leetcode():
    entries = []
    counts = {"Easy": 0, "Medium": 0, "Hard": 0}

    for level in LEVELS:
        folder = os.path.join(BASE_DIR, level)

        if not os.path.isdir(folder):
            continue

        for file in os.listdir(folder):
            path = os.path.join(folder, file)

            if os.path.isfile(path):
                counts[level] += 1

                comments = extract_top_comments(path)

                entries.append({
                    "file": f"{BASE_DIR}/{level}/{file}",
                    "level": level,
                    "comments": comments
                })

    return entries, counts


def update_readme(entries, counts):
    total = sum(counts.values())

    with open(README_FILE, "w", encoding="utf-8") as f:

        f.write("# 📘 Java LeetCode Progress\n\n")

        f.write("## 📊 Progress Counter\n\n")
        f.write(f"Easy: {counts['Easy']}\n")
        f.write(f"Medium: {counts['Medium']}\n")
        f.write(f"Hard: {counts['Hard']}\n")
        f.write(f"Total Solved: {total}\n\n")

        f.write("---\n\n")
        f.write("## 📋 Solved Problems\n\n")

        for e in entries:
            f.write(f"### 📄 {e['file']}\n")

            if e["comments"]:
                for c in e["comments"]:
                    f.write(f"- {c}\n")
            else:
                f.write("- No summary comments found\n")

            f.write("\n")

    print("README.md updated with counters 🚀")


def main():
    entries, counts = scan_leetcode()
    update_readme(entries, counts)


if __name__ == "__main__":
    main()
