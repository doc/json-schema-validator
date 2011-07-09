/*
 * Copyright (c) 2011, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package eel.kitchen.jsonschema.validators;

import org.codehaus.jackson.JsonNode;

import java.util.Collections;
import java.util.List;

public final class ConstructorChallengedValidator
    implements Validator
{
    @Override
    public boolean validate(final JsonNode node)
    {
        return true;
    }

    @Override
    public List<String> getValidationErrors()
    {
        return Collections.emptyList();
    }

    @Override
    public void setup()
    {
    }

    @Override
    public List<JsonNode> getSchemasForPath(final String subPath)
    {
        return Collections.emptyList();
    }
}
