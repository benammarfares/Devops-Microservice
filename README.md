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
![diag](https://github.com/user-attachments/assets/25dbb580-3d09-4d16-b30b-8455f1e2ab4a)

<br>


* This project is inspired and based from another mini microservice cloud [project](https://github.com/benammarfares/Assurance-MicroService) of mine . :<br> 
  * I will go threw a ci/cd process to maintain performance and automatic behavior of the project.<br>
  * Figure 1 shows the approach used in the project.<br>



    
<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With
<br>

* ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
* ![Jenkins](https://img.shields.io/badge/jenkins-%232C5263.svg?style=for-the-badge&logo=jenkins&logoColor=white)
* ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
* ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
* ![SonarQube](https://img.shields.io/badge/SonarQube-black?style=for-the-badge&logo=sonarqube&logoColor=4E9BCD)
* ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
* ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
* ![Ansible](https://img.shields.io/badge/ansible-%231A1918.svg?style=for-the-badge&logo=ansible&logoColor=white)
* ![Kubernetes](https://img.shields.io/badge/kubernetes-%23326ce5.svg?style=for-the-badge&logo=kubernetes&logoColor=white)
* ![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)



<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started
<br>

* Chapter One : Jenkins Configuration with GithubWebhook <br>
    * 1. Jenkinson instalation on Vm.<br>
    * 2. Jdk instalation on Vm.<br>
    * 3. Git instalation on Vm.<br>
    * 4. Relay instalation on Vm.<br>
    * 5. Configure tools on jenkins.<br>
    * 6. Create and configure the pipeline with git repository .<br>
    * 7. Create a webhookrelay account to get credentials.<br>
    * 8. Configure WebhookRelay via terminal.<br>
    * 9. Set WebhookRelay Agent via terminal to get the @Ip.<br>
    * 10. Create webhook on github repo ad configure it with the @Ip given from WebhookRelay.<br>
    * 11. Configure pipeline on Build Triggers section.<br>
    * 12. Test the connectivity between jenkins and github via Jenkinsfile .<br>
<br><br><br>

* Chapter Two : Docker and Docker-Compose Instalation  <br>
    * 1. Docker instalation on Vm.<br>
    * 2. Docker-Compose instalation on Vm.<br>
    * 3. Some usefull commands to begin with.<br>
<br><br><br>

* Chapter Three : SonarQube Configuration with Jenkins <br>
    * 1. Install SonarQube using Dokcer on Vm.<br>
    * 2. Install Postgres using Docker on Vm.<br>
    * 3. Create file  `docker-compose.yml` and implement the postgres and sonarqube configuration .<br>
    * 3. Test the `docker-compose.yml` via terminal to check connectivity between sonarqube and postgres.<br>
    * 4. Open sonarqube and get a user token .<br>
    * 5. Open Jenkins and configure Sonarqube tool with the token and sonarqube @url.<br>
    * 6. Test Connectivity via Jenkinsfle.<br>
<br><br><br>

    
* Chapter Four : Maven Configuration in Jenkins <br>
    * 1. Install All Maven Plugins in jenkins.<br>
    * 2. Maven build implementation in Jenkinsfile <br>
    * 3. Test microservices build status.<br>

<br><br><br>
    
<div style="text-align: center;">
  <img src="https://github.com/user-attachments/assets/e1cebe9f-5817-4558-a546-c81eeebce894" alt="Vm Configuration">
</div>

* This project is based on microservice spring Cloud architecture and a Devops process, for a simple look about the project:<br>

   * Jenkins Configuration with GithubWebhook.<br>
   * SonarQube Configuration with Jenkins.<br>
   * Maven Configuration in Jenkins.<br>
   * Dokcerize the microservices and push them to DockerHub .<br>
   * Ansible Configuration.<br>
   * Kubernetes Configuration.<br>


### Prerequisites

* Java 17 or more
* Jenkins Plugins
    * Docker Api Plugin
    * Docker Commons Plugin
    * Docker Pipeline
    * Docker Plugin
    * Git Client plugin
    * Git server plugin 
    * Github Api plugin
    * Github integration plugin
    * Github plugin 
    * Github branch source plugin
    * Github integration plugin
    * Pipeline Maven integration plugin
    * Pipeline Maven plugin API
    * Pipeline Maven plugin Database
    * Pipeline Utility Steps

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/benammarfares/Devops-Microservice-Cloud.git
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




