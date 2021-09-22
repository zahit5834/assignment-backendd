# assignment-backendd

# Assignment API
Assignment projesi için Java dilinde PostgreSql veritabanı kullandığım backend projesi.


# Contacts

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/contacts/getall | `GET` | Empty | List all movies. |
| /api/contacts/getbyid | `POST` | {'id':2 } | Get contact which given id  |
| /api/contacts/add | `POST` | {"contactLastName":"string",  "contactName":  "string",  "contactPhone":  "string",  "gender":  true,  "id":  0  }| Create a new contact or update contact |
| /api/contacts/delete | `DELETE` | {"contactLastName":"string",  "contactName":  "string",  "contactPhone":  "string",  "gender":  true,  "id":  0  } | Delete a contact. |

## Let's install PostgreSQL onto your operating system.

As an open source object-relational database management system, PostgreSQL available for MacOS, Linux, and Windows.

## Goal for each Operating System
The goal will be to run the following command successfully from the command line (regardless of the OS):

```psql -U postgres```

This should open the psql interactive shell and print a prompt that looks like:

```postgres=# ```

## Installation per OS:

### MacOS:

Let's walk through installing PostgreSQL with the postgresapp on Mac.

1) Visit http://postgresapp.com/
2) Download the most recent version --> Click "Download"
3) Open the application, and click "initialize" to create a new PostgreSQL server
4) Ensure that the Postgres.app bin folder has been added to your $PATH;
  4.1) In the command line, enter: `echo "$PATH"`
  4.2) Search through the output and make sure Postgres.app/Contents/Version/latest/bin is there
       in order to ensure that this directory's executables are callable from any directory in bash.
5) In the command line, enter: `lsof -i tcp:5432`, and ensure that the postgres `COMMAND` appears.
   This checks if the Postgres server is now running on port 5432 under the name `localhost:postgresql`
   
### Linux:

1) Acquire the source code: `wget ftp://ftp.postgresql.org/pub/source/v9.3.2/postgresql-9.3.2.tar.bz2`
2) Install the packages needed for building Postgres:
   `sudo apt-get install build-essential libreadline-dev zlib1g-dev flex bison libxml2-dev libxslt-dev libssl-dev`

### Windows:
1) Download the installer specified by EnterpriseDB for all supported PostgreSQL versions. The installer is available here:
  https://www.postgresql.org/download/windows/
  
  # After Install PostgreSQL
  You need to create database named "Assignment".
  You can run this query.
  `CREATE DATABASE Assignment`
