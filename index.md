---
layout: home
---

<!-- ## Course Objectives

This course seeks to develop students who:

1.

## Learning outcomes

Upon successful completion of this course, students will:

1.  -->

## Prerequisite

It is your responsibility to ensure you have all prerequisites for the course. For specific prerequisite requirements see the UTSC Registrar.

## Course Staff

We encourage you to post questions regarding course materials and assignments on Piazza. However, if you need extended support, the course staff will hold office hours.

<div class="grid">
    <div class="hrow row">
        <div class="hcolumn column3"></div>
        <div class="column1">Role</div>
        <div class="column3">Office Hours</div>
        <div class="column2">Location</div>
        <div class="column3">Contact</div>
    </div>
    <div class="row">
        <div class="hcolumn column3">Thierry Sans</div>
        <div class="column1">Prof</div>
        <div class="column3">{{site.data.settings.instructor.hours}}</div>
        <div class="column2">{{site.data.settings.instructor.location}}</div>
        <div class="column3">{{site.data.settings.instructor.contact}}</div>
    </div>
    {% for a in site.data.settings.assistants %}
    <div class="row">
        <div class="hcolumn column3">{{a.name}}</div>
        <div class="column1">{{a.role}}</div>
        <div class="column3">{{a.hours}}</div>
        <div class="column2">{{a.location}}</div>
        <div class="column3">{{a.contact}}</div>
    </div>
    {% endfor %}
</div>


## Course Timing

<div class="grid">
    <div class="hrow row">
        <div class="hcolumn column4"></div>
        <div class="column4">Time</div>
        <div class="column4">Location</div>
    </div>
    {% for t in site.data.settings.timings %}
    <div class="row">
        <div class="hcolumn column4">{{t.section}}</div>
        <div class="column4">{{t.time}}</div>
        <div class="column4">{{t.location}}</div>
    </div>
    {% endfor %}
</div>

## Course Information

- The [course website]({{site.data.settings.website}}) and its [Github repository]({{site.data.settings.github}})

	One of the nice things about using Github for the course website is that you can contribute to the course website. If you see something on the course website that should be fixed, or want to improve the UI, please feel free to submit a pull request. 

- [The Piazza discussion Board]({{ site.data.settings.piazza }})

	The discussion board is the best place to ask technical questions, and general questions about the course, assignments and labs. For personal issues, please use private posts. I try to respond by the end of the next day. However, due to volume, it may take longer, especially on weekends.

- The [anonymous feedback form]({{site.data.settings.feedback}})

	If you have feedback about the course, you can send an anonymous feedback to the course instructor (you also have the *option* of including your name). Since the sender cannot be determined, comments sent through the feedback form are considered public, and they may receive a response at the beginning of class or on the discussion board.

## Marking Scheme

The numeric marks of individual assignments, team assignments, project interviews, midterm and final exam will be used to compute a composite numeric score that will determine your final letter grade for the course:

The weighting of course work is set as:

<div class="grid">
    <div class="hrow row">
        <div class="hcolumn column4"></div>
        <div class="column4">Weight</div>
    </div>
    <div class="row">
        <div class="hcolumn column4">Individual Assignments</div>
        <div class="column4">10%</div>
    </div>
    <div class="row">
        <div class="hcolumn column4">Team Assignments</div>
        <div class="column4">30%</div>
    </div>
    <div class="row">
        <div class="hcolumn column4">Project Interviews</div>
        <div class="column4">10%</div>
    </div>
    <div class="row">
        <div class="hcolumn column4">Midterm Exam</div>
        <div class="column4">15%</div>
    </div>
    <div class="row">
        <div class="hcolumn column4">Final Exam</div>
        <div class="column4">35%</div>
    </div>
</div>

## Submission Policy

Electronic copy must be submitted for all assignments, except where explicitly listed as optional for an assignment component. For assignment written work (non-programming), you may submit your document in PDF only.

No late submissions will be accepted for any course work, and no make-up assignments will be provided for missed/poorly completed work. It is your responsibility to ensure that all work is completed on time and to the best of your ability.

If an emergency arises that prevents you from being able to complete any piece of work, or attend an exam, contact one of the instructors immediately. You will need to have a properly completed Illness Verification Form signed by a registered doctor in order to be given special consideration.

## Re-mark Policy

If a piece of work has been mis-marked or if you believe the rubric used to evaluate the work is not appropriate, you may request a re-mark. For a re-mark to succeed, you must clearly and concisely express what you believe was mis-marked. To request a re-mark, please contact your TA. Requests must be submitted *within 1 week* of the marks being returned.

## Academic Integrity

You are expected to comply with the [Code of Behaviour on Academic Matters](http://www.governingcouncil.utoronto.ca/Assets/Governing+Council+Digital+Assets/Policies/PDF/ppjun011995.pdf). 

Assignment solutions must be prepared individually, except where an assignment handout or FAQ explicitly allows working with a partner. Note that working with a partner may be restricted to just part of an assignment, such as programming task, whereas the rest of the assignment must be solved by an individual.

You may discuss assignments with other students, for example to clarify the requirements of an assignment, to work through examples that help you understand the technology used for an assignment, or to learn how to configure your system to run a supporting piece of software used in an assignment. However, collaboration at the level of answering written questions or designing and writing code, is strictly forbidden. Written problems and programming assignments must be answered, designed and coded by you alone, using the text, your own notes, and other texts and Web sources as aids.

Do not let other students look at your assignment solutions, since this can lead to copying. Remember you are in violation of the UTSC Academic Code whether you copy someone else's work or allow someone else to copy your work. These rules are meant to ensure that all students understand their solutions well enough to prepare the solutions themselves. If challenged you must be able to reproduce and explain your work.

The course staff reserves the right to use code and text analysis tools to compare your submission with others to verify that no improper collaboration has occurred.

Failure to comply with these guidelines is a serious academic offence. In past academic offense cases, the Associate Dean has imposed penalties for code violations that range from a mark of zero on plagiarized assignments to academic suspension from the University.

## Accessibility Needs

The University of Toronto is committed to accessibility. If you require accommodations for a disability, or have any accessibility concerns about the course, the classroom or course materials, please contact Accessibility Services as soon as possible: disability.services@utoronto.ca or <http://studentlife.utoronto.ca/accessibility>
