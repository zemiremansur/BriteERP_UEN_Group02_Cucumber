Feature: 

	#{color:#de350b}User Story{color}
	#
	#As a manager, I should be able to manage the existing category
	#
	#{color:#de350b}Acceptance Criteria{color}
	#
	# Verify that manager is able to import file to the existing the category
	#
	# 
	#
	#Verify that manager is able to duplicate the existing category.
	#
	# 
	@BRIT-4052
	Scenario: Manager should be able to manage the existing category
		Feature: Manager should be able to manage the existing category
		
		Background: 
		    Given the user is logged in
		    When the user clicks on Point of Sale
		    Then the user should be on the Point of Sale page
		    And the 'Pos Categories' should be displayed on the main panel
		    Then the user clicks on an existing category
		    And the name of the category displayed on the main panel
		      
		
		    Scenario: verify the user is able to attach file to the existing category
		    When the user clicks on the Attachment(s)
		    Then the user clicks on the Add... under the Attachment(s)
		    Then user clicks on the valid file to open
		    And '1' shows before the 'Attachment(s)'
		    
		    Scenario: verify the user is able to switch the type of existing category
		    When the user clicks on the edit
		    Then the user select the type from the dropdown box
		    Then the user clicks on Save
		   And the  parent category and name of the existing category dispalyed on the main panel
		    
		    
		