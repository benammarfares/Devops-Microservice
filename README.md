<br><br><br>
<a  align="center" name="readme-top"></a>


<!--  PROJECT LLOGO -->
<br />
<div align="center">
    <img src="https://github.com/user-attachments/assets/93433dcf-f7e7-4f96-9777-a90d18ff10c6" alt="Logo" width="100" height="100">


  <p align="center">
     Devops | Microservices with Spring Cloud .
    <br />
    <a href="https://github.com/benammarfares/Devops-Microservice-Cloud"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    ·
    <a href="https://github.com/benammarfares/Devops-Microservice-Cloud/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
  </p>
</div>



<!-- TABLEE OF CONTENTS -->
<!-- TABLEE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
![dockercompose](https://github.com/user-attachments/assets/670bcd51-19d1-4900-97ad-995aa3e23651)

<br>

![figure microservices](https://github.com/user-attachments/assets/dae8b927-fc8f-489b-976e-1eaa8186bc95)

<br>

* This project is inspired and based from another mini microservice cloud [project](https://github.com/benammarfares/Assurance-MicroService) of mine . :<br> 
  * I will go threw a process via docker-compse to dockerize all the services and maintain communication between them .<br>
  * Figure 1 shows the approach used in the project.<br>

<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Built With
<br>

* ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
* ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
* ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
* ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
* ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started
<br>

* This project utilizes a microservice architecture based on Spring Cloud and incorporates a DevOps process. <br>

* For a quick overview, simply run 'docker-compose up -d --build'. This will build and start the containers within <br>
  your Docker Desktop environment. You can then inspect their behavior through the Docker Desktop interface or view<br>
  logs for specific containers using terminal commands.

 * Important: <br>
 * Enter each service via terminal and run the mvn clean package -DskipTests to get your jar within the target in each service.

<br><br><br>
    
### Prerequisites

* Java 17 or more
* Docker desktop 

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/benammarfares/Devops-Microservice-Cloud.git
   ```
2. Package each service
   ```sh
   mvn clean package -DskipTests
   ```   
3. To Build containers
   ```sh
   docker-compose up --build
   ```   
<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

 <a href="https://www.linkedin.com/in/fares-ben-ammar-14b8b3226/">
                <img alt="LinkedIn" title="Discord" src="https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white"/></a> 
    <a href="https://www.instagram.com/fares.ben.ammar/?hl=fr">
                <img alt="Instagram" title="Instagram" src="https://img.shields.io/badge/Instagram-%23E4405F.svg?style=for-the-badge&logo=Instagram&logoColor=white"/></a>
        <a href="https://discord.gg/farou1747">
                    <img alt="Discord" title="Discord" src="https://img.shields.io/badge/Discord-%235865F2.svg?style=for-the-badge&logo=discord&logoColor=white"/></a> 
            <a href="https://facebook.com/https://www.facebook.com/faroutiti.benammar/">
                    <img alt="Facebook" title="Facebook" src="https://img.shields.io/badge/Facebook-%231877F2.svg?style=for-the-badge&logo=Facebook&logoColor=white"/></a> 
    <a href="mailto:benammar.Fares@esprit.tn">
    <img alt="Outlook" title="Outlook" src="https://img.shields.io/badge/Microsoft_Outlook-0078D4?style=for-the-badge&logo=microsoft-outlook&logoColor=white"/>



<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

Important to who will start from scratch !!!! :)

- [Spring Developer](https://www.youtube.com/@SpringSourceDev)
- [Josh Long](https://www.youtube.com/@coffeesoftware)
- [DaShaun Carter](https://www.youtube.com/@dashaun)
- [Spring Boot Learning](https://www.youtube.com/@SpringBootLearning)
- [Spring Tips](https://www.youtube.com/playlist?list=PLgGXSWYM2FpPw8rV0tZoMiJYSCiLhPnOc)
- [Amigoscode](https://www.youtube.com/@amigoscode)
- [Java Brains](https://www.youtube.com/c/JavaBrainsChannel)
- [Daily Code Buffer](https://www.youtube.com/@DailyCodeBuffer)




