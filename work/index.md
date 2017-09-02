---
layout: default
permalink: /work/
---

<div class="week hrow">
    <div class="week_id">Week</div>
    <div class="date">Deadline (5pm)</div>
    <div class="topic">Handout</div>
    <div class="topic">Rubric</div>
	<div class="topic">Type</div>
</div>

{% assign week_id = 0 %}
{% for e in site.data.work %}
<div class="week {% cycle "odd", "even" %}">
    {% if e.break %}
    <div class="week_id"></div>
    <div class="date"></div>
	<div class="topic">{{e.break}}</div>
    {% else %}
    {% assign week_id = week_id | plus: 1 %}
    <div class="week_id">{{week_id}}</div>
    <div class="date"></div>
    {% if e.handout %}
    <div class="topic"><a href="{{e.handout}}">{{e.week}}</a></div>
    {% else %}
    <div class="topic">{{e.week}}</div>
    {% endif %}
    {% if e.rubric %}
    <div class="notes"><a href="{{e.rubric}}">e.rubric</a></div>
    {% else %}
    <div class="notes"></div>
    {% endif %}
    {% if e.type %}
    <div class="readings">{{e.type}}</div>
    {% endif %}
    {% endif %}
</div>
{% endfor %}

<script type="text/javascript">
   make_schedule({{site.data.settings.first}},7,0);
</script>
   

