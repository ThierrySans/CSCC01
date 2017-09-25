---
layout: default
permalink: /tutorials/04/
---

# Product Management with Git

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

## Creating separate development branches

At this stage both `A` and `B` should have the same version of the code on their computer. Now, let us assume that `A` ad `B` want to work separately on two different features, it is not practical and not recommendable that both `A` and `B` commit their changes on the same development thread that we call the `master`. Each developer will necessarily do several commits before the feature is working and ready to be released. Therefore, we want to avoid having this work-in-progress interfering/conflicting with the work of other developpers. Furthermore, we want to avoid messing up with the currently working realeased version of the software that should be on the `master`.

Instead, it is recommended to have these two developpers working on their own feature on separate development threads that we call *branches*. Once created, a branch evolves separately without interfering with the main branch being the `master` branch. Let us see how to create branches: 

- *step 1:* create a branch. As an example we will call this branch `dev-branch` however you should give it a meaningful name that characterize the feature that branch is about

  ```
  [master] $ git branch dev-branch
  ```
  
- *step 2:* switch to that branch
  
  ```
  [master] $ git checkout dev-branch
  ```

- *step 3:* start working on that feature and commit the changes

- *step 4:* when comes the first time to push to the branch (and the first time only)

  ```
  [dev-branch] $ git push origin dev-branch
  [dev-branch] $ git pull origin dev-branch
  ```
 
As an exercise:

6. `A` and `B` create a different branch for their own feature

7.  `A` and `B` implement their own feature separately. 

8. `A` and `B` commit and push the changes to their respective branches. 

## Merging branches

Now, `A` and `B` are both going to release their respective feature by merging their development branch into the master branch. As a good practice, one should always merge the master into the dev branch first before attempting to merge the development branch into the master. Merging two branches will very likely generates conflicts and it could be very messy. Therefore, it is better to deal with these conflicts while working on the development branch rather than working on the master branche directly. When the conflicts are solved, it is now safe to merge the development branch into the master without any conflict arising this time. Assuming that we are currently working on a development branch called `dev-branch`, this how to merge it into the `master`: 

- *step 1:* merge master into dev-branch

  ```
  [dev-branch] $ git merge master
  ```

- *step 2:* solve conflicts (if any)

- *step 3:* merge dev-branch into master (if any)

  ```
  [dev-branch] $ git checkout master
  [master] $ git merge dev-branch
  ```

As an exercise: 

7. `A` merges his/her development to the master branch. Make sure to first merge the master into the development branch to resolve conflicts first if any. 

8. `B` merges his/her development to the master branch. This time, there will necessarily be conflicts while merging the master branch into the development branch first since a new version of the software has been pushed to the master branch by `A` meanwhile. 

