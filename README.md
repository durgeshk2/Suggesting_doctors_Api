# Suggesting_doctors_Api


 The Task
 We have a platform where doctors can register their patients through a mobile or web portal.
 For this to work we need to build backend APIs to achieve task like:
 ● Adding a doctor
 ● Adding a patient & it’s symptom
 ● Suggesting the doctor based on patient’s symptom
 # Doctor’s entity
 In our database we will have doctor’s name, city, email, phone number and speciality.
 ● Citycan have 3 values only i.e. Delhi, Noida, Faridabad
 ● Speciality can have 4 values i.e. Orthopedic, Gynecology, Dermatology, ENT specialist
 A doctor can be added or removed from the platform.
 # Patient’s entity
 In our database we will have patient’s name, city, email, phone number and symptom.
 ● Citycan have any value
 ● Symptomcan have the following values only
 ○ Arthritis, Backpain, Tissue injuries (comes under Orthopedic speciality)
 ○ Dysmenorrhea (comes under Gynecology speciality)
 ○ Skin infection, skin burn (comes under Dermatology speciality)
 ○ Ear pain (comes under ENT speciality)
 A patient can be added or removed from the platform.
 Following elds should have the mentioned validations at the backend:
 1. Name(should be at least 3 characters)
 2. City (should be at max 20 characters)
 3. Email (should be a valid email address)
 4. Phone number(should be at least 10 number)
 # Suggesting Doctors
 There will be another API that will accept patient ID, and suggest the doctors based out of the
 patient location and the symptom.
E.g. 1: If the patient ID that we received as request param in this API, that patient have
 Arthritis as symptom then all the doctors of that location who is an Orthopedic will be sent as
 the response, since Arthritis comes under Orthopedic speciality.
 Important Note:This suggesting doctor API is the evaluating API where the logic needs to
 be working. The suggested doctor in the API should be based on the symptom of the patient
 that links to doctor’s speciality. E.g. 2: If a patient have Eye pain then only ENT specialist
 doctor should be suggested.
 Edge-Case 1: If there isn’t any doctor on that location (i.e. outside Delhi, Noida, Faridabad),
 the response should be “We are still waiting to expand to your location”
 Edge-Case 2: If there isn’t any doctor for that symptom on that location, the response should
 be “There isn’t any doctor present at your location for your symptom”
 How you need to achieve this task?
 ● You need to use Spring Boot Framework for core functionalities along with
 Hibernate for carrying out database operations.


