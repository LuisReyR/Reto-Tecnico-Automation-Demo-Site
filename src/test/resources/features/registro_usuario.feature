#Autor: Luis Rey
  @stories
  Feature: As a user I want to register in the web Automation Demo Site verify the home screen
    @scenario1
    Scenario: Register in the web Automation Demo Site
      Given that Luis wants to access the web Automation Demo Site
      When he performs the registration on the page
        | strFirstName | strLastName | strAddress       | strEmailAddress   | strPhone   | strGender | strHobbies | strLanguages | strSkills | strCountry     | strSelectCountry | strYearBirth | strMonthBirth | strDayBirth | strPassword | strConfirmPassword |
        | Luis         | Rey         | Cll 31 # 24 - 36 | luisrey@gmail.com | 3216549870 | Male      | Movies     | English      | Java      | Select Country | Australia        | 1999         | November      | 8           | Alejo12345  | Alejo12345         |
      Then verify that the screen in loaded with text - Double Click on Edit Icon to EDIT the Table Row.