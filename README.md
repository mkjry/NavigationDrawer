New Project > Navigation Drawer Views Activity

layout files;

1. activity_main : whole page of activity_main
	- (inc) app_bar_main 
	- NavigationView
		- (inc) nav_header_main
		- (inc) activity_main_drawer
2. app_bar_main : sliding action, screens holder
	- (inc) content_main
3. content_main : content (screen fragment) holder
	- (inc) mobile_naviagtion
4. mobile_naviagtion : match (menu + fragment)
5. nav_header_main : Header layout
6. activity_main_drawer : menu group/list
7. conent_screen1, conent_screen2, conent_screen3

To add new menu4 + screen4 :

layout : 
	add menu4 item on activity_main_drawer
	add fragment_4 layout file
	add fragment name with id (id/nav_4, fragment_4)
	
logic codes :
	regist new menu id(R.id.menu4) item on Activity
	add new fragment screen code file

 
![image](https://github.com/mkjry/NavigationDrawer/assets/132794460/49c6c877-d667-434f-9ab3-4c214ed9b483)

![image](https://github.com/mkjry/NavigationDrawer/assets/132794460/ea48dc09-d9f3-4252-b9e9-d1d2f59ff6a0)
