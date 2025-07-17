#!/usr/bin/env sh

#
# Gradle start up script for Unix
#

# Determine the directory this script resides in
SCRIPT_DIR=$(cd "$(dirname "$0")" && pwd)

# Use JAVA_HOME if set, otherwise use the java on the path
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD="java"
fi

# Run Gradle
exec "$JAVACMD" -classpath "$SCRIPT_DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
