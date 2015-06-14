/* bli.c */

#include <stdio.h>
#include <unistd.h>
#include <errno.h>

void helloFromC(){
		printf("Hello from C code! \n");
}

void printOutWorkingDirFromC(){
		
		char cwd[1024]; /* creates a char with max 1024 size */
		if( getcwd(cwd, sizeof(cwd) ) != NULL )
			fprintf(stdout, "Current working directory: %s \n", cwd);
		else
			perror("getcwd() error");
}
