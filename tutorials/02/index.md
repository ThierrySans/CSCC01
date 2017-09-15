---
layout: default
permalink: /tutorials/02/
---

# Dealing with conflicts on Git

This tutorial needs to be completed with a partner. In the following, I will named `A` the first person and `B` the second one. Both `A` and `B` should work on a different computer as if they were working remotely.

## Create a repository on Github and invite a collaborator

First, we are going to create a Github repository and set `A` and `B` to work together on the same repository. 

1. After signing-in in, `A` [creates a new repository on Github](https://github.com/new)

2. Now, `A` needs to invite `B` to collaborate on this repository. To do so, `A` opens the repository page on Github, clicks on `settings`, clicks `collaborators` from the left menu, and adds `B` Github username as collaborator. 

3. `B` should accept the invitation that was sent by email or directly through Github. 

## Cloning the repository and first commit

`A` is going to push the first commit to the repository and share it with `B`.

4. `A` creates a dummy python code and push it to Github. The python program should be at least 5 lines of code. 

5. `B` pulls the file made by `A` from Github. 

## Dealing with conflicts that Git can handle automatically

At this stage both `A` and `B` should have the same version of the code on their computer. 

6. Now, both `A` and `B` modify the same file but **not the same** line of code. 

7. `A` pushes the changes to Github first.

8. `B` tries to push the changes to Github but `git` requires to pull an update version from Github first. There will be some conflicts but they should be automatically merged by `git` and you is prompted to enter a merge message. To do so, type `i` (for insert), then type the message, press the `<esc>` key (to exit insert mode) and finally `:wq` to save and close the code editor. Commit the changes and push to Github. 

9. `A` pulls the changes from Github. 

# Dealing with conflicts that Git cannot handle automatically

At this stage both `A` and `B` should have the same version of the code on their computer. 

6. Now, both `A` and `B`  modify the same file and **the same** line of code. 

7. `B` pushes the changes to Github first.

8. `A` tries to push the changes to Github but `git` requires to pull an update from Github first. Now, `git` complains that there are conflicts that need to be solved first. Open the concerned files and solve these conflicts. Commit the changes and push to Github. 

9. `B` pulls the changes from Github. 

