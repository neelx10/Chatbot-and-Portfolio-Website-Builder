import React from 'react';

const Skills = () => {
  const skills = {
    Languages: ["Java", "Kotlin", "C/C++", "Python", "HTML/CSS", "JavaScript", "SQL"],
    "Technologies and Databases": ["Spring Boot", "React.js", "Node.js", "Google Messaging Services", "RoomDB", "DaggerHilt", "Android SDK", "JUnit", "MongoDB", "SQLite", "PostgreSQL"],
    "Tools and Concepts": ["Kafka", "JWT", "Git", "GitHub", "System Design", "Distributed Systems", "REST APIs", "MVVM", "Coroutines", "Microservices", "Test Driven Development", "Software Development Lifecycle", "Object-Oriented Programming", "Low-Level Design"],
    "Cloud and DevOps": ["AWS", "Jenkins", "CI/CD"],
  };

  return (
    <section id="skills">
      <h2>Skills</h2>
      {Object.entries(skills).map(([category, items]) => (
        <div className="skill-group" key={category}>
          <h3>{category}</h3>
          <p>{items.join(', ')}</p>
        </div>
      ))}
    </section>
  );
};

export default Skills;